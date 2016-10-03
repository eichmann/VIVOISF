package edu.uiowa.slis.VIVOISF.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ListContributorListInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ListContributorListInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ListContributorListInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ListContributorListInverseIterator theListContributorListInverseIterator = (ListContributorListInverseIterator)findAncestorWithClass(this, ListContributorListInverseIterator.class);
			pageContext.getOut().print(theListContributorListInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing List for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing List for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

