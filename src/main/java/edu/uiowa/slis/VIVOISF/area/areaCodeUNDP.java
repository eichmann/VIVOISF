package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(areaCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaCodeUNDPIterator thearea = (areaCodeUNDPIterator)findAncestorWithClass(this, areaCodeUNDPIterator.class);
			pageContext.getOut().print(thearea.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing area for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

