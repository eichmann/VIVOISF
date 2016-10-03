package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsContributorListIterator theProceedingsContributorListIterator = (ProceedingsContributorListIterator)findAncestorWithClass(this, ProceedingsContributorListIterator.class);
			pageContext.getOut().print(theProceedingsContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

