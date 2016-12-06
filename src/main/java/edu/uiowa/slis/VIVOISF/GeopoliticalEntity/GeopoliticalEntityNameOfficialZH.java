package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNameOfficialZHIterator theGeopoliticalEntity = (GeopoliticalEntityNameOfficialZHIterator)findAncestorWithClass(this, GeopoliticalEntityNameOfficialZHIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

