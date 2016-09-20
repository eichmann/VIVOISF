package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumERO_0000045Iterator theErratum = (ErratumERO_0000045Iterator)findAncestorWithClass(this, ErratumERO_0000045Iterator.class);
			pageContext.getOut().print(theErratum.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

