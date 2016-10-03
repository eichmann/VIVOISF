package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumSici currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumSiciIterator theErratum = (ErratumSiciIterator)findAncestorWithClass(this, ErratumSiciIterator.class);
			pageContext.getOut().print(theErratum.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for sici tag ");
		}
		return SKIP_BODY;
	}
}

