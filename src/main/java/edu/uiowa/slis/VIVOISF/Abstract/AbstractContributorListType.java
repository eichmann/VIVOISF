package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractContributorListIterator theAbstractContributorListIterator = (AbstractContributorListIterator)findAncestorWithClass(this, AbstractContributorListIterator.class);
			pageContext.getOut().print(theAbstractContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

