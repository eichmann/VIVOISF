package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookContributorListIterator theEditedBookContributorListIterator = (EditedBookContributorListIterator)findAncestorWithClass(this, EditedBookContributorListIterator.class);
			pageContext.getOut().print(theEditedBookContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

