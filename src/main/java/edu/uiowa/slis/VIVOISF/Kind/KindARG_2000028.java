package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(KindARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindARG_2000028Iterator theKindARG_2000028Iterator = (KindARG_2000028Iterator)findAncestorWithClass(this, KindARG_2000028Iterator.class);
			pageContext.getOut().print(theKindARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

