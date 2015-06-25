/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.List;
public class GetCartsWrapperBuilder {
    //the instance to build
    private GetCartsWrapper getCartsWrapper;

	/**
     * Default constructor to initialize the instance
     */
    public GetCartsWrapperBuilder() {
        getCartsWrapper = new GetCartsWrapper();
    }

    public GetCartsWrapperBuilder result(List<Cart> result) {
        getCartsWrapper.setResult(result);
        return this;
    }

    public GetCartsWrapperBuilder meta(MetaBase meta) {
        getCartsWrapper.setMeta(meta);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public GetCartsWrapper build() {
		return getCartsWrapper;
	}
}