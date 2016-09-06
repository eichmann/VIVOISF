package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookInformationResourceSupportedByIterator theEditedBookInformationResourceSupportedByIterator = (EditedBookInformationResourceSupportedByIterator)findAncestorWithClass(this, EditedBookInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theEditedBookInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

