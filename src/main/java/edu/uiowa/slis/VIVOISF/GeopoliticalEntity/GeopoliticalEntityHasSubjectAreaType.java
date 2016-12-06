package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityHasSubjectAreaIterator theGeopoliticalEntityHasSubjectAreaIterator = (GeopoliticalEntityHasSubjectAreaIterator)findAncestorWithClass(this, GeopoliticalEntityHasSubjectAreaIterator.class);
			pageContext.getOut().print(theGeopoliticalEntityHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

