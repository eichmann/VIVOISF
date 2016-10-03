package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookInformationResourceSupportedByIterator theMultiVolumeBookInformationResourceSupportedByIterator = (MultiVolumeBookInformationResourceSupportedByIterator)findAncestorWithClass(this, MultiVolumeBookInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theMultiVolumeBookInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

