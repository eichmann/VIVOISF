package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumIsbn10Iterator theErratum = (ErratumIsbn10Iterator)findAncestorWithClass(this, ErratumIsbn10Iterator.class);
			pageContext.getOut().print(theErratum.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

