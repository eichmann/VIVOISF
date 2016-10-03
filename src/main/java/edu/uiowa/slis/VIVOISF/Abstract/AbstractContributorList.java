package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractContributorListIterator theAbstractContributorListIterator = (AbstractContributorListIterator)findAncestorWithClass(this, AbstractContributorListIterator.class);
			pageContext.getOut().print(theAbstractContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

