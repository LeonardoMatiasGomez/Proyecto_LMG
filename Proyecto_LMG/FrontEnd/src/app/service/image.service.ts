import { Injectable } from '@angular/core';
import {Storage, ref, uploadBytes, list, getDownloadURL} from '@angular/fire/storage';

@Injectable({
  providedIn: 'root'
})
export class ImageService {

  constructor(private storage: Storage) { }

  public uploadImage($event:any, name: string){
    const file = $event.target.files[0]
    const imgRef = ref(this.storage, `imagen/`+ name)
    uploadBytes(imgRef, file)
    .then(response => {this.getImages()})
    .catch(error => console.log(error))
    console.log(file); // borrar
  }

  getImages(){
    const imagesRef = ref(this.storage, `imagen`)
    list(imagesRef) 
    .then(async response => {
      for (let item of response.items){
      }
    })
    .catch(error => console.log(error))

  }
}




