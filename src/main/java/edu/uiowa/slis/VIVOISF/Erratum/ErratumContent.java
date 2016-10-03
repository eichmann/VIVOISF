package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumContent currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumContentIterator theErratum = (ErratumContentIterator)findAncestorWithClass(this, ErratumContentIterator.class);
			pageContext.getOut().print(theErratum.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for content tag ");
		}
		return SKIP_BODY;
	}
}

