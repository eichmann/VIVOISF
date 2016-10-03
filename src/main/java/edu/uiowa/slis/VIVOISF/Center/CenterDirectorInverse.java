package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterDirectorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterDirectorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterDirectorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterDirectorInverseIterator theCenterDirectorInverseIterator = (CenterDirectorInverseIterator)findAncestorWithClass(this, CenterDirectorInverseIterator.class);
			pageContext.getOut().print(theCenterDirectorInverseIterator.getDirectorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for director tag ");
		}
		return SKIP_BODY;
	}
}

