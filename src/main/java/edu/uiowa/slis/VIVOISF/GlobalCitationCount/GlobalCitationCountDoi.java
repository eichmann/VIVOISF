package edu.uiowa.slis.VIVOISF.GlobalCitationCount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GlobalCitationCountDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GlobalCitationCountDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(GlobalCitationCountDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GlobalCitationCountDoiIterator theGlobalCitationCount = (GlobalCitationCountDoiIterator)findAncestorWithClass(this, GlobalCitationCountDoiIterator.class);
			pageContext.getOut().print(theGlobalCitationCount.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing GlobalCitationCount for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing GlobalCitationCount for doi tag ");
		}
		return SKIP_BODY;
	}
}

