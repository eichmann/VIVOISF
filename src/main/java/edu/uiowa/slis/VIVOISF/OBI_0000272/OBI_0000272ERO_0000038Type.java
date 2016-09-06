package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272ERO_0000038Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272ERO_0000038Type currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272ERO_0000038Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272ERO_0000038Iterator theOBI_0000272ERO_0000038Iterator = (OBI_0000272ERO_0000038Iterator)findAncestorWithClass(this, OBI_0000272ERO_0000038Iterator.class);
			pageContext.getOut().print(theOBI_0000272ERO_0000038Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for ERO_0000038 tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for ERO_0000038 tag ");
		}
		return SKIP_BODY;
	}
}

