package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityCodeDBPediaIDIterator theGeopoliticalEntity = (GeopoliticalEntityCodeDBPediaIDIterator)findAncestorWithClass(this, GeopoliticalEntityCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

