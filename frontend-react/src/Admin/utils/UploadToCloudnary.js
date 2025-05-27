export const uploadToCloudinary = async (pics) => {
    
    if (pics) {

       
      
      const data = new FormData();
      data.append("file", pics);
      data.append("upload_preset", "");
      data.append("cloud_name", "");
  
      const res = await 
      fetch(``, {
        method: "post",
        body: data,
      })
        
        const fileData=await res.json();
        console.log("url : ", fileData);
        return fileData.url
  
    } else {
      console.log("error");
    }
  };