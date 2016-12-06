package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindRO_0002234 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindRO_0002234 currentInstance = null;
	private static final Log log = LogFactory.getLog(KindRO_0002234.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindRO_0002234Iterator theKindRO_0002234Iterator = (KindRO_0002234Iterator)findAncestorWithClass(this, KindRO_0002234Iterator.class);
			pageContext.getOut().print(theKindRO_0002234Iterator.getRO_0002234());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

