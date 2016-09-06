package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumARG_0000001Iterator theErratum = (ErratumARG_0000001Iterator)findAncestorWithClass(this, ErratumARG_0000001Iterator.class);
			pageContext.getOut().print(theErratum.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

