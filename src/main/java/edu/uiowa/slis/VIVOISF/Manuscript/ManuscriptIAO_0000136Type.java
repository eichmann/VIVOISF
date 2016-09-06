package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptIAO_0000136Iterator theManuscriptIAO_0000136Iterator = (ManuscriptIAO_0000136Iterator)findAncestorWithClass(this, ManuscriptIAO_0000136Iterator.class);
			pageContext.getOut().print(theManuscriptIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

