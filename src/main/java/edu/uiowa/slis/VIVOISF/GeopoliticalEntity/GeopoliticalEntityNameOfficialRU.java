package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNameOfficialRUIterator theGeopoliticalEntity = (GeopoliticalEntityNameOfficialRUIterator)findAncestorWithClass(this, GeopoliticalEntityNameOfficialRUIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

