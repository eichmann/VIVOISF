package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumIsbn13Iterator theErratum = (ErratumIsbn13Iterator)findAncestorWithClass(this, ErratumIsbn13Iterator.class);
			pageContext.getOut().print(theErratum.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

