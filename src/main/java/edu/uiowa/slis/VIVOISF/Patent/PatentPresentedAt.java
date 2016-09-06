package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentPresentedAtIterator thePatentPresentedAtIterator = (PatentPresentedAtIterator)findAncestorWithClass(this, PatentPresentedAtIterator.class);
			pageContext.getOut().print(thePatentPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

