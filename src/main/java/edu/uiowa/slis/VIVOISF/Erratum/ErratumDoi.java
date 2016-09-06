package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumDoiIterator theErratum = (ErratumDoiIterator)findAncestorWithClass(this, ErratumDoiIterator.class);
			pageContext.getOut().print(theErratum.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for doi tag ");
		}
		return SKIP_BODY;
	}
}

