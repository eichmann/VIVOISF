package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityCodeUNIterator theGeopoliticalEntity = (GeopoliticalEntityCodeUNIterator)findAncestorWithClass(this, GeopoliticalEntityCodeUNIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

