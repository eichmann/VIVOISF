package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityCodeAGROVOCIterator theGeopoliticalEntity = (GeopoliticalEntityCodeAGROVOCIterator)findAncestorWithClass(this, GeopoliticalEntityCodeAGROVOCIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

