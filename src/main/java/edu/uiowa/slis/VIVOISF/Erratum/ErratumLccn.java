package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumLccnIterator theErratum = (ErratumLccnIterator)findAncestorWithClass(this, ErratumLccnIterator.class);
			pageContext.getOut().print(theErratum.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for lccn tag ");
		}
		return SKIP_BODY;
	}
}

