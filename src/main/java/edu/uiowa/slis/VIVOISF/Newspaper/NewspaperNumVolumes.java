package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperNumVolumes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperNumVolumes currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperNumVolumes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewspaperNumVolumesIterator theNewspaper = (NewspaperNumVolumesIterator)findAncestorWithClass(this, NewspaperNumVolumesIterator.class);
			pageContext.getOut().print(theNewspaper.getNumVolumes());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for numVolumes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for numVolumes tag ");
		}
		return SKIP_BODY;
	}
}

