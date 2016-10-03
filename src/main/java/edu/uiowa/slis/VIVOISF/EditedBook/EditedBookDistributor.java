package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookDistributorIterator theEditedBookDistributorIterator = (EditedBookDistributorIterator)findAncestorWithClass(this, EditedBookDistributorIterator.class);
			pageContext.getOut().print(theEditedBookDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for distributor tag ");
		}
		return SKIP_BODY;
	}
}

