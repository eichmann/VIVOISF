package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineInformationResourceSupportedByIterator theMagazineInformationResourceSupportedByIterator = (MagazineInformationResourceSupportedByIterator)findAncestorWithClass(this, MagazineInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theMagazineInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

