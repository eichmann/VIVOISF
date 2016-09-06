package edu.uiowa.slis.VIVOISF.GlobalCitationCount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GlobalCitationCountHasGlobalCountDate extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GlobalCitationCountHasGlobalCountDate currentInstance = null;
	private static final Log log = LogFactory.getLog(GlobalCitationCountHasGlobalCountDate.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GlobalCitationCountHasGlobalCountDateIterator theGlobalCitationCountHasGlobalCountDateIterator = (GlobalCitationCountHasGlobalCountDateIterator)findAncestorWithClass(this, GlobalCitationCountHasGlobalCountDateIterator.class);
			pageContext.getOut().print(theGlobalCitationCountHasGlobalCountDateIterator.getHasGlobalCountDate());
		} catch (Exception e) {
			log.error("Can't find enclosing GlobalCitationCount for hasGlobalCountDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing GlobalCitationCount for hasGlobalCountDate tag ");
		}
		return SKIP_BODY;
	}
}

