package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumCodenIterator theErratum = (ErratumCodenIterator)findAncestorWithClass(this, ErratumCodenIterator.class);
			pageContext.getOut().print(theErratum.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for coden tag ");
		}
		return SKIP_BODY;
	}
}

