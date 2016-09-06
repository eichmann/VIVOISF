package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisVolumeIterator theThesis = (ThesisVolumeIterator)findAncestorWithClass(this, ThesisVolumeIterator.class);
			pageContext.getOut().print(theThesis.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for volume tag ");
		}
		return SKIP_BODY;
	}
}

