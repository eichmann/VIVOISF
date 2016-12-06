package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(areaCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaCodeFAOTERMIterator thearea = (areaCodeFAOTERMIterator)findAncestorWithClass(this, areaCodeFAOTERMIterator.class);
			pageContext.getOut().print(thearea.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing area for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

