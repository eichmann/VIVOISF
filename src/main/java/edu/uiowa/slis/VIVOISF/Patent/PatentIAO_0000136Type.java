package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentIAO_0000136Iterator thePatentIAO_0000136Iterator = (PatentIAO_0000136Iterator)findAncestorWithClass(this, PatentIAO_0000136Iterator.class);
			pageContext.getOut().print(thePatentIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

