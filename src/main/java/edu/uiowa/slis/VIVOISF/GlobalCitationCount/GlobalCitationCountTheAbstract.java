package edu.uiowa.slis.VIVOISF.GlobalCitationCount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GlobalCitationCountTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GlobalCitationCountTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(GlobalCitationCountTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GlobalCitationCountTheAbstractIterator theGlobalCitationCount = (GlobalCitationCountTheAbstractIterator)findAncestorWithClass(this, GlobalCitationCountTheAbstractIterator.class);
			pageContext.getOut().print(theGlobalCitationCount.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing GlobalCitationCount for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing GlobalCitationCount for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

