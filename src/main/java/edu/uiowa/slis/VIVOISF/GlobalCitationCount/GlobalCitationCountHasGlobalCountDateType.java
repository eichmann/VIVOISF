package edu.uiowa.slis.VIVOISF.GlobalCitationCount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GlobalCitationCountHasGlobalCountDateType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GlobalCitationCountHasGlobalCountDateType currentInstance = null;
	private static final Log log = LogFactory.getLog(GlobalCitationCountHasGlobalCountDateType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GlobalCitationCountHasGlobalCountDateIterator theGlobalCitationCountHasGlobalCountDateIterator = (GlobalCitationCountHasGlobalCountDateIterator)findAncestorWithClass(this, GlobalCitationCountHasGlobalCountDateIterator.class);
			pageContext.getOut().print(theGlobalCitationCountHasGlobalCountDateIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GlobalCitationCount for hasGlobalCountDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing GlobalCitationCount for hasGlobalCountDate tag ");
		}
		return SKIP_BODY;
	}
}

