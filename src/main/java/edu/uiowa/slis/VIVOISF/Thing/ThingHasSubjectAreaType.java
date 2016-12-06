package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingHasSubjectAreaIterator theThingHasSubjectAreaIterator = (ThingHasSubjectAreaIterator)findAncestorWithClass(this, ThingHasSubjectAreaIterator.class);
			pageContext.getOut().print(theThingHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

