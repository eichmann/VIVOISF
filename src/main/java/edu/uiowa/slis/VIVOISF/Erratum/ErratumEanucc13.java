package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumEanucc13Iterator theErratum = (ErratumEanucc13Iterator)findAncestorWithClass(this, ErratumEanucc13Iterator.class);
			pageContext.getOut().print(theErratum.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

