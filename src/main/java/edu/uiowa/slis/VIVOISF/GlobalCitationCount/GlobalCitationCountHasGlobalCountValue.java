package edu.uiowa.slis.VIVOISF.GlobalCitationCount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GlobalCitationCountHasGlobalCountValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GlobalCitationCountHasGlobalCountValue currentInstance = null;
	private static final Log log = LogFactory.getLog(GlobalCitationCountHasGlobalCountValue.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GlobalCitationCountHasGlobalCountValueIterator theGlobalCitationCount = (GlobalCitationCountHasGlobalCountValueIterator)findAncestorWithClass(this, GlobalCitationCountHasGlobalCountValueIterator.class);
			pageContext.getOut().print(theGlobalCitationCount.getHasGlobalCountValue());
		} catch (Exception e) {
			log.error("Can't find enclosing GlobalCitationCount for hasGlobalCountValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing GlobalCitationCount for hasGlobalCountValue tag ");
		}
		return SKIP_BODY;
	}
}

