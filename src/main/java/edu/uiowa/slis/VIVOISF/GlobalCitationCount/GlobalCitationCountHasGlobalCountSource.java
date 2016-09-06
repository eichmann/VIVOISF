package edu.uiowa.slis.VIVOISF.GlobalCitationCount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GlobalCitationCountHasGlobalCountSource extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GlobalCitationCountHasGlobalCountSource currentInstance = null;
	private static final Log log = LogFactory.getLog(GlobalCitationCountHasGlobalCountSource.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GlobalCitationCountHasGlobalCountSourceIterator theGlobalCitationCountHasGlobalCountSourceIterator = (GlobalCitationCountHasGlobalCountSourceIterator)findAncestorWithClass(this, GlobalCitationCountHasGlobalCountSourceIterator.class);
			pageContext.getOut().print(theGlobalCitationCountHasGlobalCountSourceIterator.getHasGlobalCountSource());
		} catch (Exception e) {
			log.error("Can't find enclosing GlobalCitationCount for hasGlobalCountSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing GlobalCitationCount for hasGlobalCountSource tag ");
		}
		return SKIP_BODY;
	}
}

