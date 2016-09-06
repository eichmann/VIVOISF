package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindARG_2000029 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindARG_2000029 currentInstance = null;
	private static final Log log = LogFactory.getLog(KindARG_2000029.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindARG_2000029Iterator theKindARG_2000029Iterator = (KindARG_2000029Iterator)findAncestorWithClass(this, KindARG_2000029Iterator.class);
			pageContext.getOut().print(theKindARG_2000029Iterator.getARG_2000029());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for ARG_2000029 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for ARG_2000029 tag ");
		}
		return SKIP_BODY;
	}
}

