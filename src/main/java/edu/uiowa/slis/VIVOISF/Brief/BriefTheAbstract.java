package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefTheAbstractIterator theBrief = (BriefTheAbstractIterator)findAncestorWithClass(this, BriefTheAbstractIterator.class);
			pageContext.getOut().print(theBrief.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

