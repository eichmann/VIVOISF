package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(KindCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindCodeDBPediaIDIterator theKind = (KindCodeDBPediaIDIterator)findAncestorWithClass(this, KindCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theKind.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

