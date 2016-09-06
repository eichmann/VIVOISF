package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(KindIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindIAO_0000136Iterator theKindIAO_0000136Iterator = (KindIAO_0000136Iterator)findAncestorWithClass(this, KindIAO_0000136Iterator.class);
			pageContext.getOut().print(theKindIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

