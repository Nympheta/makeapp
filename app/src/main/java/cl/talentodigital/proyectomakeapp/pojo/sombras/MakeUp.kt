import com.google.gson.annotations.SerializedName

/*
Copyright (c) 2020 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */


data class MakeUp (

	@SerializedName("id") val id : Int,
	@SerializedName("brand") val brand : String,
	@SerializedName("name") val name : String,
	@SerializedName("price") val price : Double,
	@SerializedName("price_sign") val price_sign : String,
	@SerializedName("currency") val currency : String,
	@SerializedName("image_link") val image_link : String,
	@SerializedName("product_link") val product_link : String,
	@SerializedName("website_link") val website_link : String,
	@SerializedName("description") val description : String,
	@SerializedName("rating") val rating : String,
	@SerializedName("category") val category : String,
	@SerializedName("product_type") val product_type : String,
	@SerializedName("tag_list") val tag_list : List<String>,
	@SerializedName("created_at") val created_at : String,
	@SerializedName("updated_at") val updated_at : String,
	@SerializedName("product_api_url") val product_api_url : String,
	@SerializedName("api_featured_image") val api_featured_image : String,
	@SerializedName("product_colors") val product_colors : List<Makeup_colors>
)