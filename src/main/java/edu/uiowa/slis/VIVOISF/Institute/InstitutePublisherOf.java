package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstitutePublisherOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstitutePublisherOf currentInstance = null;
	private static final Log log = LogFactory.getLog(InstitutePublisherOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstitutePublisherOfIterator theInstitutePublisherOfIterator = (InstitutePublisherOfIterator)findAncestorWithClass(this, InstitutePublisherOfIterator.class);
			pageContext.getOut().print(theInstitutePublisherOfIterator.getPublisherOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

