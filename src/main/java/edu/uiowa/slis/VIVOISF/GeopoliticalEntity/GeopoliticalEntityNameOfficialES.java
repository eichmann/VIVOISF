package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNameOfficialESIterator theGeopoliticalEntity = (GeopoliticalEntityNameOfficialESIterator)findAncestorWithClass(this, GeopoliticalEntityNameOfficialESIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

