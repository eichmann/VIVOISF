package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentHasSubjectAreaIterator theContinentHasSubjectAreaIterator = (ContinentHasSubjectAreaIterator)findAncestorWithClass(this, ContinentHasSubjectAreaIterator.class);
			pageContext.getOut().print(theContinentHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

