package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumHandleIterator theErratum = (ErratumHandleIterator)findAncestorWithClass(this, ErratumHandleIterator.class);
			pageContext.getOut().print(theErratum.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for handle tag ");
		}
		return SKIP_BODY;
	}
}

